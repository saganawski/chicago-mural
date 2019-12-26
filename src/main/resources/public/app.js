$(document).ready(function() {
	
    $.ajax({
        url: "http://localhost:8080/murals"
    }).then(function(data) {
    	setCards(data._embedded.murals)
    	
    });
    
    function setCards(murals){
    	for(let mural of murals){
    		
    		var html = "<div class='col s12 l4'>\n"
    		+ "<div class='card meduim'>\n"
    		+ "<div class='card-image'>\n"
    		+ "<img alt='' src='images/no-image.png'>\n"
    		+ "<a class='btn-floating halfway-fab waves-effect waves-light red'><i class='material-icons'>favorite</i></a>\n"
    		+ "</div>\n"
    		+ "<div class='card-content'>\n"
    		+ "<span class='card-title'>"+ mural.artworkTitle +"</span>\n"
    		+ "<p>"+ mural.streetAddress +"</p>\n"
    		+ "</div>\n"
    		+ "<div class='card-action'>\n"
    		+ "<a href='#'>More Details</a>\n"
    		+ "</div>\n"
    		+ "</div>\n"
    		+ "</div>"
    		
    		$('#mural-card').append(html);
    		
    	}
    }
    
    
    
    // colopse links to hamburger in mobile
    $('.sidenav').sidenav();
    
});