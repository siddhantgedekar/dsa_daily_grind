public class TimeConversion {
    public static String solution (String s) {
        int hr = Integer.parseInt(s.substring(0,2));
        String ampm = s.substring(8, 10);
        /*if(ampm.equals("AM")) {
            if(hr == 12) {
                s = s.replace("12", "00");
            }
        } else {
            if(hr != 12) {
                hr += 12;
                s = s.replace(s.substring(0,2), hr+"");
            }
        } */
        if(hr == 12 && ampm.equals("AM")) {
            s = s.replace(s.substring(0,2), "00");
        } else if(hr < 12 && ampm.equals("PM")) {
            hr += 12;
            s = s.replace(s.substring(0,2), (hr+""));
        }
        return s.substring(0,8);
    }
    public static void main(String [] args) {
        String s = "07:05:45PM";
        System.out.printf("Converting %s -> %s\n",s,solution(s));
    }
}