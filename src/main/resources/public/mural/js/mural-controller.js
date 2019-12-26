$(document).ready(function() {
	
	let searchParams = new URLSearchParams(window.location.search);
	
	if(searchParams.has('muralId')){
		var muralId = searchParams.get('muralId');
		
	    $.ajax({
	    	//TODO new route
	        url: "http://localhost:8080/murals/" + muralId
	    }).then(function(data) {
	    	setDescriptionDetails(data);
	    	
	    });
	}
    
	function setDescriptionDetails(mural){
		title = mural.artworkTitle;
		artist = mural.artistCredit;
		commissioned = mural.affiliatedOrCommissioning;
		description = mural.descriptionOfArtwork;
		address = mural.streetAddress;
		
		// find and set text
		$('#title').append(" " + title);
		$('#artist').append(" " + artist);
		$('#commissioned').append(" " + commissioned);
		$('#description').append(" " + description);
		$('#address').append(" " + address);
	}
	
    // colopse links to hamburger in mobile
    $('.sidenav').sidenav();
});