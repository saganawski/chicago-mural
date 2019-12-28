$(document).ready(function() {
	
	$('#nav').load("_nav.html");
	
    $.ajax({
        url: "/murals"
    }).then(function(data) {
    	setCards(data._embedded.murals);
    	setPaganation(data);
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
    		+ "<a href='/mural/mural-details.html?muralRegestrationId="+ mural.muralRegestrationId + "'>More Details</a>\n"
    		+ "</div>\n"
    		+ "</div>\n"
    		+ "</div>"
    		$('#mural-card').append(html);
    		
    	}
    }
    
    function setPaganation(paganation){
    	pageNumber = paganation.page.number;
    	pageCount = paganation.page.totalPages;
    	for(var i=1; i <= pageCount; i++){
    		//set left chevron
    		if(i === 1){
    			$('#pagination').append('<li id="left-chevron" class="waves-effect"><a href="#!"><i class="material-icons">chevron_left</i></a></li>');
    		}
    		//set normal page
    		$('#pagination').append('<li class="waves-effect"><a href="#!">'+ i +'</a></li>');
    		//set right chevron
    		if(i === pageCount){
    			$('#pagination').append('<li id="right-chevron" class="waves-effect"><a href="#!"><i class="material-icons">chevron_right</i></a></li>');
    		}
    		
    		//set ative class
    		setPaganationClassAttributes(pageNumber, pageCount);
    	}
    }
    	// set active class info
    function setPaganationClassAttributes(pageNumber, pageCount){
    	// highlight active page
    	$('#pagination').find('li').find('a').eq(pageNumber + 1).parent("li").removeClass("waves-effect").addClass("active");
    	
    	// dissable left chevron
    	if(pageNumber === 0){
    		$('#left-chevron').addClass("disabled");
    	}    	
    	//dissable right chenvron
    	if(pageNumber === pageCount){
    		$('#right-chevron').addClass("disabled");
    	}
    		
    }

    //function to handle paganation
    
    // colopse links to hamburger in mobile
    $('.sidenav').sidenav();
    
});






























