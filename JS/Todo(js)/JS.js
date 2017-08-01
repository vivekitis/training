window.onload = function(){
	console.log("hello","World");
	var table_body = document.getElementsByTagName("tbody");
	for(var i=0;i<10;i++){
		var tr=document.createElement("tr");
		for(var j=0;j<3;j++){
			var td=document.createElement("td");
			var inp=document.createElement("inp");
			td.appendChild(inp);
			tr.appendChild(td);
			inp.innerHTML="88";
			inp.addEventListener("click",function(e){
				var val=e.text;
				console.log("Value ",val);
			});
		}
		table_body[0].appendChild(tr);
	}
}