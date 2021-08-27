
        // add the image in jframe  u can used the ImageIcon class of swing
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));

         // scale of the image to change  the size of the image using the AWT image class
        Image i2 = i1.getImage().getScaledInstance(380, 320, Image.SCALE_DEFAULT);
       
        ImageIcon i3 = new ImageIcon(i2);
         // u can not directly put the image in frame then u can used the label and put  the imageicon class object in label parameter
        JLabel l9 = new JLabel(i3);
        l9.setBounds(460, 80, 400, 320);
        add(l9);
