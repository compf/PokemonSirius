extends Control
var inputHandler
var thr=Thread.new()
# Called when the node enters the scene tree for the first time.
func _ready():
	
	runServer()
	print("thread stated")
	
	pass
	#$CanvasLayer/PopupMenu.popup(Rect2i(50,50,100,100))
	
func runServer():
	inputHandler=HttpPlayerInputHandler.new()
	print("thread")
	var server = HttpServer.new()
	server.register_router("/requestInput", inputHandler)
	add_child(server)
	server.start()
	print("started")


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta):

	pass


func _on_item_list_item_activated(index):
	print("clci")
	inputHandler.sem.post()
	pass # Replace with function body.
