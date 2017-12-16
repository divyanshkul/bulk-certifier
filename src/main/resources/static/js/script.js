function valueChanged(){
    if($('.customCB').is(":checked")){
        $(".enter_custom").hide();
    	$(".upload_form").show();    	
    }
    else{
        $(".enter_custom").show();
        $(".upload_form").hide();
    }    	
}
function handleFiles(files) {
      // Check for the various File API support.
      if (window.FileReader) {
          // FileReader are supported.
          getAsText(files[0]);
      } else {
          alert('FileReader are not supported in this browser.');
      }
    }

function getAsText(fileToRead) {
      var reader = new FileReader();
      // Read file into memory   
      reader.readAsText(fileToRead);
      // Handle errors load
      reader.onload = loadHandler;
      reader.onerror = errorHandler;
    }

function loadHandler(event) {
      var csv = event.target.result;
      processData(csv);
    }

function processData(csv) {
    var student_data = csv.split(/\r?\n|\r/);
    var table_data = '<table class="table table-bordered table-striped">';
    for(var count = 0; count<student_data.length; count++){
        var cell_data = student_data[count].split(",");
        table_data += '<tr>';
        for(var cell_count=0; cell_count<cell_data.length; cell_count++){
            if(count === 0){
                table_data += '<th>'+cell_data[cell_count]+'</th>';
            }
            else{
                table_data += '<td>'+cell_data[cell_count]+'</td>';
            }
        }
     table_data += '</tr>';
    }
    table_data += '</table>';
    $('#displayResults').html(table_data);
}
function errorHandler(evt) {
    if(evt.target.error.name == "NotReadableError") {
        alert("Canno't read file !");
      }
    }
