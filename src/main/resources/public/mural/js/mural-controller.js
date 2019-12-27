$(document).ready(function() {
	let searchParams = new URLSearchParams(window.location.search);
	if(searchParams.has('muralRegestrationId')){
		var muralRegestrationId = searchParams.get('muralRegestrationId');
		
	    $.ajax({
	        url: "/mural/details/" + muralRegestrationId
	    }).then(function(data) {
	    	setDescriptionDetails(data);
	    });
	}
    
	function setDescriptionDetails(mural){
		title = mural.artworkTitle;
		artist = mural.artistCredit;
		commissioned = mural.affiliatedOrCommissioning;
		description = mural.descriptionOfArtWork;
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