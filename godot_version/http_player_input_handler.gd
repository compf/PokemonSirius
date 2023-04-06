extends "res://addons/godottpd/http_router.gd"
class_name HttpPlayerInputHandler
var thr
var sem=Semaphore.new()
func handle_get(request, response):
	print("beforesdsds")
	thr=Thread.new()
	thr.start(my_handle.bind(response))
	
func my_handle(response):
	sem.wait()
	print("hello")
	var data={}
	data["Kind"]="PlayerInput"
	data["PokemonIndex"]=0
	data["PlayerId"]=0
	data["TargetPlayer"]=1
	data["TargetPokemonIndex"]=0
	data["MoveIndex"]=0
	var toSend=JSON.stringify(data)
	response.send(200, toSend)
	
