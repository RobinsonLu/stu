package cn.haohaowo.stu2;

import java.awt.*;
import javax.swing.*;
import java.util.*;

// 定义测试类
//所有变量名冲突的变量名串1了，不过就效果不好~~
public class TimerTest
{
// 定义主函数
@SuppressWarnings("deprecation")
public static void main(String[] args)
{

//定义 JFrame类的一个对象，并创建该对象
MyTimer1 f = new MyTimer1();
//调用MyTimer的 show()方法
f.show();

//----------------------------------------------------

//调用类的构造函数
MyTimer myTimer=new MyTimer();

//调用类的显示时间函数
myTimer.displayCurrentTime();

//调用类的设置时间函数
myTimer.setCurrentTime();

//调用类的显示时间函数
myTimer.displayCurrentTime();

//调用类的显示时间函数
myTimer.displayCurrentTime();
System.exit(0);
}
}

// 定义MyTimer类
class MyTimer1 extends JFrame
{ static int count=0; //判断是否重定义了时间
//构造函数
public MyTimer1()
{
//定义窗口大小
setSize(320, 200);
//定义窗口标题
setTitle("测试自定义时钟类！");

Container c = getContentPane();
// new ClockCanvas("北京时间", "GMT+8")

c.add(new ClockCanvas("北京时间", "GMT+8"));
}
}

//定义接口
interface TimerListener1
{
void timeElapsed(Timer1 t);
}

class Timer1 extends Thread //类Timer1
{
private TimerListener1 target;
private int interval;

public Timer1(int i, TimerListener1 t)
{
target = t;
interval = i;
setDaemon(true);
}

public void run()
{ try
{
while (!interrupted())
{
sleep(interval);
target.timeElapsed(this);
}
}
catch(InterruptedException e) {}
}
}

class ClockCanvas extends JPanel //clockcanvas
implements TimerListener1
{
static int seconds = 0;
private String city;

private GregorianCalendar calendar;

//构造函数
public ClockCanvas(String c, String tz)
{
city = c;
calendar = new GregorianCalendar(TimeZone.getTimeZone(tz));
Timer1 t = new Timer1(1000, this);
t.start();
setSize(180, 180);
}

// 绘制钟面
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawOval(100, 5, 120, 120);
g.drawOval(101, 6, 118, 118);
// 分离时间
double hourAngle = 2 * Math.PI
* (seconds - 3 * 60 * 60) / (12 * 60 * 60);
double minuteAngle = 2 * Math.PI
* (seconds - 15 * 60) / (60 * 60);
double secondAngle = 2 * Math.PI
* (seconds - 15) / 60;


g.drawLine(160, 64, 160 + (int)(20* Math.cos(hourAngle)),
64 + (int)(30 * Math.sin(hourAngle)));
g.drawLine(160, 65, 160 + (int)(20* Math.cos(hourAngle)),
65 + (int)(30 * Math.sin(hourAngle)));
g.drawLine(160, 66, 160 + (int)(20* Math.cos(hourAngle)),
66 + (int)(30 * Math.sin(hourAngle)));
g.drawLine(160, 63, 160 + (int)(20* Math.cos(hourAngle)),
63 + (int)(30 * Math.sin(hourAngle)));
g.drawLine(160, 67, 160 + (int)(20* Math.cos(hourAngle)),
67 + (int)(30 * Math.sin(hourAngle)));

g.drawLine(160, 65, 160 + (int)(32* Math.cos(minuteAngle)),
65 + (int)(40 * Math.sin(minuteAngle)));
g.drawLine(160, 64, 160 + (int)(32* Math.cos(minuteAngle)),
64 + (int)(40 * Math.sin(minuteAngle)));

g.drawLine(160, 65, 160 + (int)(55* Math.cos(secondAngle)),
65 + (int)(45 * Math.sin(secondAngle)));

g.drawString(city, 130, 150);//*/
}

public void timeElapsed(Timer1 t)
{
calendar.setTime(new Date());
if(MyTimer1.count==1) {int a=1;

seconds=MyTimer.intHour*60*60+MyTimer.intMinute*60+MyTimer.intSecond;
seconds+=a;//a为秒自加


repaint();}
else

{ seconds = calendar.get(Calendar.HOUR) * 60 * 60
+ calendar.get(Calendar.MINUTE) * 60
+ calendar.get(Calendar.SECOND);
repaint();}
}
}


//定义时钟类
class MyTimer
implements TimerListener
{
//定义时钟类的属性
static int intHour,intMinute,intSecond;


//构造函数
public MyTimer()
{
setCurrentTimeAsSystemTime();
Timer t = new Timer(1000, this); //实例Timer类，里面有run方法
t.start();
}

//显示当前时间
public void displayCurrentTime()
{
JOptionPane.showMessageDialog(null,intHour+":"+intMinute+":"+intSecond);
}


//设定当前时间
public void setCurrentTime()
{
// 从对话框输入时，分秒
String strTemp=JOptionPane.showInputDialog(null,"请输入当前小时（24小时制)：");
int iHour=Integer.parseInt(strTemp);

strTemp=JOptionPane.showInputDialog(null," 请输入当前分：");
int iMinute=Integer.parseInt(strTemp);

strTemp=JOptionPane.showInputDialog(null," 请输入当前秒：");
int iSecond=Integer.parseInt(strTemp);

//设定当前时间为对话框输入的时间
if(iHour>=0&&iHour<24)
intHour=iHour;
else intHour=0;
if(iMinute>=0&&iMinute<60)
intMinute=iMinute;
else intMinute=0;
if(iSecond>=0&&iSecond<60)
intSecond=iSecond;
MyTimer1.count++;

// ClockCanvas.seconds=iHour*60*60+iMinute*60+iSecond;

}

// 设定当前时间为系统时间，构造函数调用
public void setCurrentTimeAsSystemTime()
{
// 定义Date类的一个对象，用来获取系统时间
Date timeCurrent=new Date();

//将系统的时，分秒设定为当前时间
intHour=timeCurrent.getHours();

intMinute=timeCurrent.getMinutes();

intSecond=timeCurrent.getSeconds();
}

//走时
public void timeElapsed(Timer t)
{
//系统走时

intSecond++;
if (intSecond==60)
{
intMinute++;
intSecond=0;
}

if (intMinute==60)
{
intHour++;
intMinute=0;
}

if (intHour==24)
{
intHour=0;
}

}
}

interface TimerListener //接口了
{
void timeElapsed(Timer t);
}

class Timer extends Thread //类啊！！！
{
private TimerListener target;
private int interval;

public Timer(int i, TimerListener t)
{
target = t;
interval = i;
setDaemon(true); //Thread 里面方法 目的跟着老大走
}

public void run()
{ try
{
while (!interrupted())
{
sleep(interval);
target.timeElapsed(this);
}
}
catch(InterruptedException e) {}
}
}

 