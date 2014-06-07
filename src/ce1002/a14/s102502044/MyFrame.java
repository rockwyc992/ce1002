package ce1002.a14.s102502044;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {

    JButton add_car;
    JButton start_race;
    JLabel cars_amount;
    CarRace race;

    //config frame
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("A14-102502044");
     
        new_all_member();

        setSize(350, 130);
        setVisible(true);
    }

    //new and add all member
    void new_all_member() {
        ActionListener listener;
        race = new CarRace();

        add_car = new JButton("add car");
        listener = new add_car_listener();
        add_car.addActionListener(listener);
        add_car.setBounds(10, 10, 80, 30);
        add(add_car);

        start_race = new JButton("start");
        listener = new start_race_listener();
        start_race.addActionListener(listener);
        start_race.setBounds(10, 50, 80, 30);
        add(start_race);

        cars_amount = new JLabel("cars: 0");
        cars_amount.setBounds(150, 10, 80, 30);
        add(cars_amount);

    }
    
    //listener of add car button
    class add_car_listener implements ActionListener {

        add_car_listener() {
        }

        public void actionPerformed(ActionEvent event) {
            race.add_car();
            int amount = race.car_amount();
            cars_amount.setText("cars: "+amount);
        }
    }

    //listener of start race button
    class start_race_listener implements ActionListener {

        start_race_listener() {
        }

        public void actionPerformed(ActionEvent event) {
            int amount = race.car_amount();
            Thread racing = new Thread(race);
            if(amount > 0) {
                racing.start();
            } else {
                JOptionPane.showMessageDialog(null, "There must be at least one car!", "No Car", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
