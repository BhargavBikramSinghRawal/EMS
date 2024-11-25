package employeee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class AddEmployee extends JFrame implements ActionListener{
    
Random ran = new Random();
int number = ran.nextInt(999999);
    
JTextField tfname, tffname, tfaddress, tfphone, tfnagrita, tfemail, tfsalary, tfdesignation;
JDateChooser dcdob;
JComboBox cbeducation;
JLabel lblempId;
JButton add, back;
    
AddEmployee() {
getContentPane().setBackground(Color.WHITE);
setLayout(null);
        
JLabel heading = new JLabel("Add Employee Detail");
heading.setBounds(320, 30, 500, 50);
heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
add(heading);
        
JLabel labelname = new JLabel("Name");
labelname.setBounds(50, 150, 150, 30);
labelname.setFont(new Font("serif", Font.PLAIN, 20));
add(labelname);
        
tfname = new JTextField();
tfname.setBounds(200, 150, 150, 30);
add(tfname);
        
JLabel labelfname = new JLabel("Father's Name");
labelfname.setBounds(400, 150, 150, 30);
labelfname.setFont(new Font("serif", Font.PLAIN, 20));
add(labelfname);
        
tffname = new JTextField();
tffname.setBounds(600, 150, 150, 30);
add(tffname);
        
JLabel labeldob = new JLabel("Date of Birth");
labeldob.setBounds(50, 200, 150, 30);
labeldob.setFont(new Font("serif", Font.PLAIN, 20));
add(labeldob);
        
dcdob = new JDateChooser();
dcdob.setBounds(200, 200, 150, 30);
add(dcdob);
        
JLabel labelsalary = new JLabel("Salary");
labelsalary.setBounds(400, 200, 150, 30);
labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
add(labelsalary);
        
tfsalary = new JTextField();
tfsalary.setBounds(600, 200, 150, 30);
add(tfsalary);
        
JLabel labeladdress = new JLabel("Address");
labeladdress.setBounds(50, 250, 150, 30);
labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
add(labeladdress);
        
tfaddress = new JTextField();
tfaddress.setBounds(200, 250, 150, 30);
add(tfaddress);
        
JLabel labelphone = new JLabel("Phone");
labelphone.setBounds(400, 250, 150, 30);
labelphone.setFont(new Font("serif", Font.PLAIN, 20));
add(labelphone);
        
tfphone = new JTextField();
tfphone.setBounds(600, 250, 150, 30);
add(tfphone);
        
JLabel labelemail = new JLabel("Email");
labelemail.setBounds(50, 300, 150, 30);
labelemail.setFont(new Font("serif", Font.PLAIN, 20));
add(labelemail);
        
tfemail = new JTextField();
tfemail.setBounds(200, 300, 150, 30);
add(tfemail);
        
JLabel labeleducation = new JLabel("Higest Education");
labeleducation.setBounds(400, 300, 150, 30);
labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
add(labeleducation);
        
String courses[] = {"BBA", "BCA", "CSIT", "BA", "BSC", "B.COM", "BHM", "MBA", "MCA", "MA", "BBS", "MSC", "MBBS", "PHD"};
cbeducation = new JComboBox(courses);
cbeducation.setBackground(Color.WHITE);
cbeducation.setBounds(600, 300, 150, 30);
add(cbeducation);
        
JLabel labeldesignation = new JLabel("Designation");
labeldesignation.setBounds(50, 350, 150, 30);
labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
add(labeldesignation);
        
tfdesignation = new JTextField();
tfdesignation.setBounds(200, 350, 150, 30);
add(tfdesignation);
        
JLabel labelnagrita = new JLabel("Nagrita Number");
labelnagrita.setBounds(400, 350, 150, 30);
labelnagrita.setFont(new Font("serif", Font.PLAIN, 20));
add(labelnagrita);
        
tfnagrita = new JTextField();
tfnagrita.setBounds(600, 350, 150, 30);
add(tfnagrita);
        
JLabel labelempId = new JLabel("Employee id");
labelempId.setBounds(50, 400, 150, 30);
labelempId.setFont(new Font("serif", Font.PLAIN, 20));
add(labelempId);
        
lblempId = new JLabel("" + number);
lblempId.setBounds(200, 400, 150, 30);
lblempId.setFont(new Font("serif", Font.PLAIN, 20));
add(lblempId);
        
add = new JButton("Add Details");
add.setBounds(250, 550, 150, 40);
add.addActionListener(this);
add.setBackground(Color.BLACK);
add.setForeground(Color.WHITE);
add(add);
        
back = new JButton("Back");
back.setBounds(450, 550, 150, 40);
back.addActionListener(this);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
add(back);
        
setSize(900, 700);
setLocation(300, 50);
setVisible(true);
    }
    
public void actionPerformed(ActionEvent ae) {
if (ae.getSource() == add) {
String name = tfname.getText();
String fname = tffname.getText();
Date dob = dcdob.getDate();
String salary = tfsalary.getText();
String address = tfaddress.getText();
String phone = tfphone.getText();
String email = tfemail.getText();
String education = (String) cbeducation.getSelectedItem();
String designation = tfdesignation.getText();
String nagrita = tfnagrita.getText();
String empId = lblempId.getText();
            
 // Validation checks

        if (name.isEmpty() || !name.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Name must contain only letters and cannot be empty");
            return;
        }
        if (fname.isEmpty() || !fname.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Father's Name must contain only letters and cannot be empty");
            return;
        }
        if (salary.isEmpty() || !isNumeric(salary)) {
            JOptionPane.showMessageDialog(null, "Salary should be a valid number");
            return;
        }
        if (address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address cannot be empty");
            return;
        }
        if (phone.isEmpty() || phone.length() != 10 || !phone.startsWith("9")) {
            JOptionPane.showMessageDialog(null, "Phone number should start with 9 and be 10 digits long");
            return;
        }
        if (email.isEmpty() || !isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Invalid email format");
            return;
        }
        if (nagrita.isEmpty() || nagrita.length() != 10) {
            JOptionPane.showMessageDialog(null, "Nagrita number should be 10 digits long");
            return;
        }
        
//        //from here
//          // Validate date
  if (dob == null) {
            JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty");
            return;
        }

        try {
            Date today = new Date(); // Current date
            Calendar calendar = Calendar.getInstance();

            // Calculate 20 years ago
            calendar.setTime(today);
            calendar.add(Calendar.YEAR, -20);
            Date minDate = calendar.getTime();

            if (dob.after(today)) {
                JOptionPane.showMessageDialog(null, "Date of Birth cannot be in the future");
                return;
            }

            if (dob.after(minDate)) {
                JOptionPane.showMessageDialog(null, "Employee must be at least 20 years old");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Date of Birth format");
            return;
        }
//        //end here
        
try {
Conn conn = new Conn();
String query = "insert into employeee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+nagrita+"', '"+empId+"')";
conn.s.execute(query);
JOptionPane.showMessageDialog(null, "Details added successfully");
setVisible(false);
new Home();
} catch (Exception e) {
e.printStackTrace();
}
} else {
setVisible(false);
new Home();
}
}

public static void main(String[] args) {
new AddEmployee();
}
//can be delete from here
    private boolean isNumeric(String salary) {
         try {
        Double.parseDouble(salary);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
         }
    private boolean isValidEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(emailRegex);
}
    //upto here
}