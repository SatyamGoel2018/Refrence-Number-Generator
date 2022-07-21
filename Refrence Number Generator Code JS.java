function sendEmails(){

 var ss = SpreadsheetApp.getActiveSpreadsheet().getActiveSheet();
 var st = SpreadsheetApp.getActiveSpreadsheet().getActiveSheet();
 var lr = ss.getLastRow();    
  
 for(var i=2;i<=lr;i++){

      var currentEmail=ss.getRange(i,3).getValue();
      Logger.log(currentEmail);

      var data = st.getRange(i,1).getValue();
      Logger.log(data);
 }
 
  
  MailApp.sendEmail(currentEmail,"Refrence Number ", "The Refrence Number for the letter is: " + data);
}

// =ARRAYFORMULA("CTDOC/IT/2022/" & text (ROW (B1:INDEX(B:B,COUNTA(B:B)-1)),"100"))
/* place this google sheet function where you want to generate the refrence number 
as in my case I have placed it in the A column where A1 is heading and A2 is the generated
refrence number. For sending email to the I have used the C coloumn where C1 is heading and 
from C2 there will be Emails */

/* Basically this code is cretaed for maintaining the record of refrence numbers that are used on the
letter of the company whenever a letter is issued by company's representative. Earlier we have to maintain the
hand written ledger for this but now we can digitilize this process by the help of google apps scripts */
