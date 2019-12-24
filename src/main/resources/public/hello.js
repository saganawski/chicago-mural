$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/murals"
    }).then(function(data) {
    	console.log(data);
    });
});