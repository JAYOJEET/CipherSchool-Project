int fare=200;
        int Tax = 15;
        int miles = 0;
        int Tfare =0;
        int Dtax=0;
        int SubTotal = 0;
      
       if(jComboBoxDestination.getSelectedItem().equals("Mumbai") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
    
        int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Mumbai");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
           miles = 6;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
         
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Mumbai") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonSingle1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Mumbai");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
      
           miles = 6;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Mumbai") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null)) ){
           int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Mumbai");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
          miles = 6;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Mumbai") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Mumbai");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
           miles = 6;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else if(jComboBoxTime.getSelectedItem().equals("Select Time")){
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Amritsar")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
     int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
      jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Amritsar");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");       
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
              miles = 4;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Amritsar") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
           int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Amritsar");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
                  miles = 4;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else{
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Amritsar")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Amritsar");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Binalabagan");
       
       miles = 4;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
           if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Amritsar") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Amritsar");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
      
           miles = 4;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kozikode") && jRadioButtonEconomy1.isSelected() 
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozikode");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
       miles = 5;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
           else if(jComboBoxDestination.getSelectedItem().equals("Kozikode") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozikode");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
           miles = 5;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
       if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kozikode") && jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozikode");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
      
       miles = 5;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
   if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
           else if(jComboBoxDestination.getSelectedItem().equals("Kozikode") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozikode");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
      
           miles = 5;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("New Delhi")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("New Delhi");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
       miles = 7;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("New Delhi") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("New Delhi");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
           miles = 7;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*(Pass);
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("New Delhi")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("New Delhi");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
       miles = 7;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("New Delhi") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("New Delhi");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
      
           miles = 7;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*(Pass);
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Indore")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Indore");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Binalabagan");
      
        miles = 9;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Indore") && jRadioButtonFirstClass1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Indore");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
      
           miles = 9;
           Tfare= (miles*fare)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Indore")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Indore");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
       
        miles = 9;
           Tfare= miles*fare*2;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
           if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
         
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Indore") && jRadioButtonFirstClass1.isSelected()
               && jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){           
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Indore");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Kolkata");
     
        miles = 9;
           Tfare= (miles*fare*2)+500;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
      jTextFieldTicketType.setText("Round Trip");
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }  
       }
       else if((!jRadioButtonSingle1.isSelected() && !jRadioButtonReturn1.isSelected()) ||
               (!jRadioButtonFirstClass1.isSelected()&& !jRadioButtonEconomy1.isSelected()) ||
               jComboBoxDestination.getSelectedItem().equals("Select Destination")|| jTextFieldPassenger1.getText()== "" ){
       jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);       
       }       
      
      
       else{
           jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
       }