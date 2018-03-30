## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |  10000000          | 0.014692 sec    |
| Using ReentrantLock     |  10000000          | 1.301015 sec    |
| Syncronized method      |  10000000          | 0.790292 sec    |
| AtomicLong for total    |  10000000          | 0.343142 sec    |

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |  100000            | 0.003872 sec    |
| Using ReentrantLock     |  100000            | 0.019974 sec    |
| Syncronized method      |  100000            | 0.012660 sec    |
| AtomicLong for total    |  100000            | 0.004506 sec    |

## 1. Using unsynchronized counter object

1.1 it often be 0 but several time it not 0
1.2 it about 0.013000 
1.3 because each thread don't know each other (don't wait) thread1 finish its task or not thread2 don't, it just do the task 

## 2. Implications for Multi-threaded Applications

implementation of Multi-Thread Make app more faster because it separate work for each Thread

## 3. Counter with ReentrantLock

3.1 Count 1 to 10,000,000 in 1.396115 sec total is 0
3.2 because it lock for own thread can access at one moment of time, then unlock for other thread can access to value. So thread1 +k to counter, after this thread2 will -k to counter that No accessing from thread1
3.3 ReetrantLock be like cable that communicate thread1 with thread2
3.4 when it finish task and unlock for other thread to access value

## 4. Counter with synchronized method

4.1 it like ReentrantLock that it make one thread can access to value at one moment of time
4.2 thread1 +k to counter, after this thread2 will -k to counter that No accessing from thread1
4.3 Only One thread can do this task at One moment of time. When you want Only one thread do this task at the time 

## 5. Counter with AtomicLong

5.1 because it always check value of this thread going to update is the same value of its resource or not
5.2 when you want to be careful if this value get update from other process or not

## 6. Analysis of Results

6.1 fastest is Atomic one. slowest is WithLock one 
6.2 Sync one because it easy to implement with complex data


## 7. Using Many Threads (optional)

