$(document).ready(function() {
	
	$('#nav').load("_nav.html");
	
	getMuralCards("/murals");
    
	function getMuralCards(url){
		$('#mural-card').empty();
		
        $.ajax({
            url: url
        }).then(function(data) {
        	setCards(data._embedded.murals);
        	setPaganation(data);
        });
    }
    
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
    	$('#pagination').empty();
    	
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
    		
    		setPaganationClassAttributes(pageNumber, pageCount);
    	}
    }

    function setPaganationClassAttributes(pageNumber, pageCount){
    	// highlight active page
    	$('#pagination').find('li').find('a').eq(pageNumber + 1).parent("li").removeClass("waves-effect").addClass("active");
    	
    	// dissable left chevron
    	if(pageNumber === 0){
    		$('#left-chevron').addClass("disabled");
    	}    	
    	//dissable right chenvron
    	if(pageNumber === (pageCount -1)){
    		$('#right-chevron').addClass("disabled");
    	}
    		
    }

    //function to handle paganation on click event
    $('#pagination').click(function(event) {
    	event.preventDefault();
    	
    	target = event.target.innerText;
    	cheveronPageAction(target);
    	
    	pageNumber = event.target.text - 1;
    	
    	if(target != "chevron_left" && target != "chevron_right"){
    		url = "murals/?page=" + pageNumber;
    		getMuralCards(url);
    	}
    	    	
    });
    
    function cheveronPageAction(target){
    	currentPage = $('#pagination li.active').text();
    	// do nothing 
    	if((target != "chevron_left") && (target != "chevron_right")){
    		return;
    	}else if((target === "chevron_left" && currentPage === "1") || (target === "chevron_right" && currentPage === "15")){
    		return;
    	}
    	
    	if(target === "chevron_left"){
    		goToPageNumber = currentPage -2
    		url = "murals?page=" + goToPageNumber;
        	getMuralCards(url);		
    	}
    	
    	if(target === "chevron_right"){
    		goToPageNumber = currentPage;
    		url = "murals?page=" + goToPageNumber;
        	getMuralCards(url);	
    	}
    }
    
    // colopse links to hamburger in mobile
    $('.sidenav').sidenav();
    
});






























