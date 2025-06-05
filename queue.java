cIass Queue
{
private Node front,rear:
public Queue ()
{
this.front+this.rear=null;
}
public void enqueue (int data);
if(rear==null)
{
front=rear=newNode;
rear=newNode
}
rear.next=newNode;
rear=newNode;
}
public int dequence ()
{
if(front==null)
{
System.out.println("Queue Underflow!Cannot dequence from an empty queue queue.");
return-1;
}
int dequeueData=front.data;
Front=Front.