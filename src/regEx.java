class MyRegex{
    String pattern;
    //1- 0<n<255
    //2- less than 3
    //3- leading 00 allowed

}
class regEX {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        String IP = in.next();
        System.out.println(IP.matches(new MyRegex().pattern));
        }*/

        //way to split .  1-/\\ back slash  2- []  3- pattern.quote

        String a = "111.222.333";
        String[] st = a.split("\\.");

      //  System.out.println(st[0] + " " + st[1] + " " + st[2]);

        char p = st[0].charAt(0);
        int i1 = Integer.parseInt(st[0]);
        int i2 = Integer.parseInt(st[1]);
        int i3 = Integer.parseInt(st[2]);

    if (i1 > 0 && i1 < 225) {
        System.out.println(i1);
    }else if (st[0].length() == 3) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Error");
        }

    if (i2 > 0 && i2 < 225) {
        System.out.println(i2);
        if (st[1].length() == 3) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Error");
        }
    }

    if (i3 > 0 && i3 < 225) {
        System.out.println(i3);
        if (st[2].length() == 3) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Error");
        }
    }
}
    /*for(String c:st){
        //to convert string to int for check
        int a1=Integer.parseInt(c);

        if(a1 < 255 && a1 > 0) {
        }else{System.out.println("value out of bound");break;}
        if(c.length()==3){
            System.out.println("valid IP address");
        }else{System.out.println("error string bigger than 3");break;}
    }}}*/
        }


