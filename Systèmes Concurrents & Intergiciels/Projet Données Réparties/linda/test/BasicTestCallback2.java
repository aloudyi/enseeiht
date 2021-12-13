Zenon
#1038



Text Channel
general
Search

December 4, 2021

LOTFI Med Hamza — 12/04/2021
lo7hom hna llah y3zzek khouk rah ma9ra Sus Concurrents mn 3ehd lmourabitine

younes alahyane — 12/04/2021


Zenon — 12/04/2021
ana gha kansm3 biha

LOTFI Med Hamza — 12/04/2021
hhhhh mattkhle3ch a khay Younes rah dghya kanrecuperiw hhhhhh

1

younes alahyane — 12/04/2021
system concurrent ghi chi ostora ka yehedro 3liha nas mera mera

Zenon — 12/04/2021
wlah a khay youness rak fi aman

LOTFI Med Hamza — 12/04/2021
asatir l2awaline

younes alahyane — 12/04/2021
la la ma tekhle3tch ghi ma tkhel3och

Zenon — 12/04/2021
hhhhhhhhhhhhhhh

@younes alahyane
la la ma tekhle3tch ghi ma tkhel3och

LOTFI Med Hamza — 12/04/2021
HHHHHHHHHHHHHH

Zenon — 12/04/2021
dir chi github awda youness
[2:31 PM]
ma acceptitich l'invite awda  @LOTFI Med Hamza

@Zenon
dir chi github awda youness

younes alahyane — 12/04/2021
3endi compte
[2:32 PM]
dayer younesalah

Zenon — 12/04/2021
drti fih
[2:33 PM]
chi github slide show

younes alahyane — 12/04/2021
wah

Zenon — 12/04/2021
saf srdt lik invite

younes alahyane — 12/04/2021
mareftch wach mazal ma weslatni wla ana li makanerefch kifach nkhedem github

Zenon — 12/04/2021

[2:36 PM]
dkhl streami
[2:37 PM]
7it ta ana new lhdchi

younes alahyane — 12/04/2021

SysConcurrent.tar
500.00 KB
December 10, 2021

Zenon — 12/10/2021
@everyone salamon 3laykom

LOTFI Med Hamza — 12/10/2021
alaykomo salaam

younes alahyane — 12/10/2021


[8:58 PM]


younes alahyane — 12/10/2021


Zenon — 12/10/2021
List<MyType> myList = new ArrayList<>()
[11:17 PM]
List<Tuple> tupleList = new ArrayList<>()
December 11, 2021

younes alahyane — 12/11/2021
asalamo alaykom

Zenon — 12/11/2021
و عليكم السلام و رحمة الله تعالى و بركاته

LOTFI Med Hamza — 12/11/2021
wa 3alikoum salam

younes alahyane — 12/11/2021
bdina ?

LOTFI Med Hamza — 12/11/2021
la bitou

Zenon — 12/11/2021
drna lyoma m3a 4 ?
[4:23 PM]
gha bdaw bla bya
[4:24 PM]
db njoini mnhna wahd 30mins

LOTFI Med Hamza — 12/11/2021
iwa sf tal dik lou9ita ga3 ou ntla9aw nmchi nit n3awd n9ra dik event register nfhemha mzyane

Zenon — 12/11/2021
alright

younes alahyane — 12/11/2021
https://stackoverflow.com/questions/3184883/concurrentmodificationexception-for-arraylist
Stack Overflow
ConcurrentModificationException for ArrayList
I have the following piece of code:

private String toString(List<DrugStrength> aDrugStrengthList) {
StringBuilder str = new StringBuilder();
for (DrugStrength aDrugStrength :


LOTFI Med Hamza — 12/11/2021
https://github.com/thibmeu/enseeiht-linda/blob/master/shm/CentralizedLinda.java
GitHub
enseeiht-linda/CentralizedLinda.java at master · thibmeu/enseeiht-l...
Project of parallel programming in Java. Aim to program an API to simplify parallel programming. - enseeiht-linda/CentralizedLinda.java at master · thibmeu/enseeiht-linda

December 12, 2021

younes alahyane — Yesterday at 8:50 PM
drari ndiro l rapport daba ?

LOTFI Med Hamza — Yesterday at 8:51 PM
sat douz lvocal ngaddou ana wyak

LOTFI Med Hamza — Yesterday at 10:21 PM

rapport_provisoire_PDR.pdf
78.24 KB

younes alahyane — Yesterday at 10:22 PM
package linda.shm;

import linda.Callback;
import linda.Linda;
import linda.Tuple;
import java.util.*;
import java.util.concurrent.locks.*;
import Synchro.Assert;
/** Shared memory implementation of Linda. */
public class CentralizedLindaEvent implements Linda {
	// L'espace des Tuples qu'on va manipuler
    private List<Tuple> tupleSpace;
    // Mon moniteur
    private ReentrantLock monitor;
    // condition lecture (read)
    private Condition readPossible;
    // condition prise (take)
    private Condition takePossible;
    // condition Ã©criture (write)
    private Condition writePossible;
    // ecriture en cours ?
    private boolean currentlyWriting;
    // prise en cours ?
    private boolean currentlyTaking;     
    // nombre de lecteurs en cours
    private int currentReaders;
    // nombre de lecteurs en attente
    private int waitingReaders;
    // nombre d'Ã©crivains en attente
    private int waitingWriters;


    public CentralizedLindaEvent() {

        monitor = new ReentrantLock();
        readPossible = monitor.newCondition();
        takePossible = monitor.newCondition();
        writePossible = monitor.newCondition();
        currentlyTaking = false;
        currentlyWriting = false;
        currentReaders = 0;
        waitingReaders = 0;
        waitingWriters = 0;
        tupleSpace = new ArrayList<>();

    }

    // Demande Lecture
    private void startReading() throws InterruptedException {

        monitor.lock();       
        while(currentlyWriting || currentlyTaking) {
            waitingReaders++;
            readPossible.await();
            waitingReaders--;        
        }
        currentReaders++;
        readPossible.signal();
        monitor.unlock();

    }

    // Terminer Lecture
    private void finishReading() throws InterruptedException {

        monitor.lock();
        currentReaders--;
        if(currentReaders == 0) {
            if(waitingWriters > 0) {
                writePossible.signal();
            } else {
                takePossible.signal();
            }
        }
        monitor.unlock();

    }

    // Demander Prise
    private void startTaking() throws InterruptedException {

        monitor.lock();
        while(currentlyWriting || currentlyTaking || currentReaders != 0 || waitingReaders > 0 || waitingWriters > 0) {
            takePossible.await();
        }
        currentlyTaking = true;
        monitor.unlock();
    
    }

    // Terminer Prise
    private void finishTaking() throws InterruptedException {

        monitor.lock();
        currentlyTaking = false;
        if(waitingReaders > 0) {
            readPossible.signal();
        } else if(waitingWriters > 0) {
            writePossible.signal();
        } else {
... (242 lines left)
Collapse
CentralizedLindaEvent.java
11 KB
[10:22 PM]

package linda.test;

import linda.*;
import linda.Linda.eventMode;
import linda.Linda.eventTiming;
Expand
BasicTestCallback2.java
2 KB

LOTFI Med Hamza — Yesterday at 11:04 PM
chabab ana anlou7 lprojet daba bhad centralized lli sift younes ou rapport rah dekht bnn3as

Zenon — Yesterday at 11:07 PM
sir3lah
[11:07 PM]
allay ywef9ek

Message #general
﻿




 to select
OFFLINE — 3

LOTFI Med Hamza

younes alahyane

Zenon

package linda.test;

import linda.*;
import linda.Linda.eventMode;
import linda.Linda.eventTiming;

public class BasicTestCallback2 {

    private static Linda linda;
    private static Tuple cbmotif;
    
    private static class MyCallback implements Callback {
        public void call(Tuple t) {
            System.out.println("CB got "+t);
            
            linda.eventRegister(eventMode.TAKE, eventTiming.FUTURE, cbmotif, this);
           
            System.out.println("CB done with "+t);
        }
    }

    public static void main(String[] a) {
        linda = new linda.shm.CentralizedLindaEvent();
        // linda = new linda.server.LindaClient("//localhost:4000/MonServeur");

        cbmotif = new Tuple(Integer.class, String.class);
        linda.eventRegister(eventMode.TAKE, eventTiming.FUTURE, cbmotif, new MyCallback());

        Tuple t1 = new Tuple(4, 5);
        System.out.println("(2) write: " + t1);
        linda.write(t1);

        
        Tuple t2 = new Tuple("hello", 15);
        System.out.println("(2) write: " + t2);
        linda.write(t2);
        linda.debug("(2)");

       
        Tuple t3 = new Tuple(4, "foo");
        System.out.println("(2) write: " + t3);
        linda.write(t3);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Tuple t4 = new Tuple(4, "foo");
        System.out.println("(2) write: " + t4);
        linda.write(t4);
        
        Tuple t5 = new Tuple(4, "foo");
        System.out.println("(2) write: " + t5);
        linda.write(t5);
        linda.debug("(2)");

    }

}