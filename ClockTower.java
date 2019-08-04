class Clock
{
int hour;
int min;
int sec;
int msec;

Clock(int hour, int min, int sec)
{
this.hour= hour;
this.min=min;
this.sec=sec;
}

Clock(int hour, int min, int sec, int msec)
{
this(hour,min,sec);
this.msec=msec;
}

public void ClockInfo()
{
System.out.print(this.hour+"hours ");
System.out.print(this.min+"minutes ");
System.out.print(this.sec+"Seconds ");
System.out.print(this.msec+"milliseconds ");
System.out.println();

}


}

class ClockTower
{
public static void main(String[] args)
{
System.out.println("main starts");
Clock c1= new Clock(5,15,10);
Clock c2= new Clock(8,20,15,5);
c1.ClockInfo();

c2.ClockInfo();

System.out.println("main ends");

}
}