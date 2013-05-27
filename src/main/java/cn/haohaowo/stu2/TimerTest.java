package cn.haohaowo.stu2;

import java.awt.*;
import javax.swing.*;
import java.util.*;

// ���������
//���б�������ͻ�ı�������1�ˣ�������Ч������~~
public class TimerTest
{
// ����������
@SuppressWarnings("deprecation")
public static void main(String[] args)
{

//���� JFrame���һ�����󣬲������ö���
MyTimer1 f = new MyTimer1();
//����MyTimer�� show()����
f.show();

//----------------------------------------------------

//������Ĺ��캯��
MyTimer myTimer=new MyTimer();

//���������ʾʱ�亯��
myTimer.displayCurrentTime();

//�����������ʱ�亯��
myTimer.setCurrentTime();

//���������ʾʱ�亯��
myTimer.displayCurrentTime();

//���������ʾʱ�亯��
myTimer.displayCurrentTime();
System.exit(0);
}
}

// ����MyTimer��
class MyTimer1 extends JFrame
{ static int count=0; //�ж��Ƿ��ض�����ʱ��
//���캯��
public MyTimer1()
{
//���崰�ڴ�С
setSize(320, 200);
//���崰�ڱ���
setTitle("�����Զ���ʱ���࣡");

Container c = getContentPane();
// new ClockCanvas("����ʱ��", "GMT+8")

c.add(new ClockCanvas("����ʱ��", "GMT+8"));
}
}

//����ӿ�
interface TimerListener1
{
void timeElapsed(Timer1 t);
}

class Timer1 extends Thread //��Timer1
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

//���캯��
public ClockCanvas(String c, String tz)
{
city = c;
calendar = new GregorianCalendar(TimeZone.getTimeZone(tz));
Timer1 t = new Timer1(1000, this);
t.start();
setSize(180, 180);
}

// ��������
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawOval(100, 5, 120, 120);
g.drawOval(101, 6, 118, 118);
// ����ʱ��
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
seconds+=a;//aΪ���Լ�


repaint();}
else

{ seconds = calendar.get(Calendar.HOUR) * 60 * 60
+ calendar.get(Calendar.MINUTE) * 60
+ calendar.get(Calendar.SECOND);
repaint();}
}
}


//����ʱ����
class MyTimer
implements TimerListener
{
//����ʱ���������
static int intHour,intMinute,intSecond;


//���캯��
public MyTimer()
{
setCurrentTimeAsSystemTime();
Timer t = new Timer(1000, this); //ʵ��Timer�࣬������run����
t.start();
}

//��ʾ��ǰʱ��
public void displayCurrentTime()
{
JOptionPane.showMessageDialog(null,intHour+":"+intMinute+":"+intSecond);
}


//�趨��ǰʱ��
public void setCurrentTime()
{
// �ӶԻ�������ʱ������
String strTemp=JOptionPane.showInputDialog(null,"�����뵱ǰСʱ��24Сʱ��)��");
int iHour=Integer.parseInt(strTemp);

strTemp=JOptionPane.showInputDialog(null," �����뵱ǰ�֣�");
int iMinute=Integer.parseInt(strTemp);

strTemp=JOptionPane.showInputDialog(null," �����뵱ǰ�룺");
int iSecond=Integer.parseInt(strTemp);

//�趨��ǰʱ��Ϊ�Ի��������ʱ��
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

// �趨��ǰʱ��Ϊϵͳʱ�䣬���캯������
public void setCurrentTimeAsSystemTime()
{
// ����Date���һ������������ȡϵͳʱ��
Date timeCurrent=new Date();

//��ϵͳ��ʱ�������趨Ϊ��ǰʱ��
intHour=timeCurrent.getHours();

intMinute=timeCurrent.getMinutes();

intSecond=timeCurrent.getSeconds();
}

//��ʱ
public void timeElapsed(Timer t)
{
//ϵͳ��ʱ

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

interface TimerListener //�ӿ���
{
void timeElapsed(Timer t);
}

class Timer extends Thread //�డ������
{
private TimerListener target;
private int interval;

public Timer(int i, TimerListener t)
{
target = t;
interval = i;
setDaemon(true); //Thread ���淽�� Ŀ�ĸ����ϴ���
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

 