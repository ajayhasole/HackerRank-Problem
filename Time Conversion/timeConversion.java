class timeConversion{

          public static String time(String s){
			   String res="";
          int time=Integer.parseInt(s.substring(0,2));
          String t=s.substring(8,10);
          if(t.equals("PM")){
              if(time==12){
                   res=time+s.substring(2,8);
          
              }
                time=time+12;
              
             
          }else{
              if(time==12){
              time=time-12;
              }
              res="0"+time+s.substring(2,8);
          }
          res=time+s.substring(2,8);
          return res;
    }        

public static void main(String arg[]){

System.out.println(time("07:05:45PM"));
}
}