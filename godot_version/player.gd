extends CharacterBody2D


# Called when the node enters the scene tree for the first time.
func _ready():
	pass # Replace with function body.


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
		move_and_collide((delta))
		$AnimatedSprite2D.play()
	else:
		$AnimatedSprite2D.stop()
