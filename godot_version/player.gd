extends CharacterBody2D
enum TileKind{
	None,Obstacle,Grass
}
const OBSTACLE_RECTS=[Rect2i(12,0,3,3)]
const GRASS_RECTS=[Rect2i(20,12,1,1)]
	

# Called when the node enters the scene tree for the first time.
func _ready():
	var args=[]
	var err=OS.execute("/home/compf/.sdkman/candidates/gradle/8.0.2/bin/gradle",args)
	print("Hello ",err)

func get_collider_kind(coord:Vector2i)->TileKind:
	for g in GRASS_RECTS:
		if g.has_point(coord):
			return TileKind.Grass
	for o in OBSTACLE_RECTS:
		if o.has_point(coord):
			return TileKind.Obstacle
	return TileKind.None
# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta):
	delta=Vector2(0,0)
	const BY=1
	if Input.is_action_pressed("move_up"):
		delta.y=-BY
		$AnimatedSprite2D.animation = "up"
	elif Input.is_action_pressed("move_down"):
		delta.y=BY
		$AnimatedSprite2D.animation = "down"
	elif Input.is_action_pressed("move_left"):
		delta.x=-BY
		$AnimatedSprite2D.animation = "left"
	elif Input.is_action_pressed("move_right"):
		$AnimatedSprite2D.animation = "right"
		delta.x=BY
	
	if delta!=Vector2.ZERO:
		#position+=delta
		var collision=self.move_and_collide(delta,true)
		if collision!=null:


			var collision_pos=collision.get_position()
			var local_pos = get_parent().local_to_map(position)
			var cell_coord=self.get_parent().get_cell_atlas_coords(0,local_pos,true)
			#print(local_pos)
			#print(cell_coord)
			#print()
			if  cell_coord.x==-1 and cell_coord.y==-1 or get_collider_kind(cell_coord)==TileKind.Grass:
					self.position+=delta
		else:
			self.position+=delta
		$AnimatedSprite2D.play()
	else:
		$AnimatedSprite2D.stop()
