<html>
    <body>
        <table width='100%' style='border-collapse: collapse; color:rgb(51,153,255); background:rgb(230,230,230);'>

             <#include "partials/icons.ftl">

            <tr>
                <td style='height:800px; padding:20px; text-align:center; border: 10px solid #787878'>
                    <span style='font-size:60px; font-weight:bol'>${certificate.org}</span>
                    <br/><br/>
                    <span style='font-size:50px; font-weight:bol'>${certificate.title}</span>
                    <br/><br/>
                    <span style='font-size:25px'><i>This is to certify that</i></span>
                    <br/><br/>
                    <span style='font-size:30px'><b> ${certificate.student.name} </b></span><br/><br/>
                    <span style='font-size:25px'><i>has completed the course</i></span> <br/><br/>
                    <span style='font-size:30px'>  ${certificate.course}  </span> <br/><br/>
                    <span style='font-size:20px'>with score of <b>  ${certificate.student.score}  </b></span>
                </td>
            </tr>


            <#include "partials/signs.ftl">


        </table>
    </body>
</html>