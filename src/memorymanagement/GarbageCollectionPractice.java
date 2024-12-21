package memorymanagement;

import java.lang.ref.Cleaner;

public class GarbageCollectionPractice {

    private static final Cleaner cleaner = Cleaner.create();

    private static class State implements Runnable {
        @Override
        public void run() {
            System.out.println("Cleanup performed!");
        }
    }

    public GarbageCollectionPractice() {
        cleaner.register(this, new State());
    }

    public static void main(String[] args) {
        GarbageCollectionPractice gcp1 = new GarbageCollectionPractice();
        GarbageCollectionPractice gcp2 = new GarbageCollectionPractice();
        GarbageCollectionPractice gcp3 = new GarbageCollectionPractice();

        gcp1 = null;
        gcp2 = gcp3;

        new GarbageCollectionPractice();
        System.gc();
    }

    /*VM Options*/
    //java -Xlog:gc* GarbageCollectionPractice
    //java -Xlog:gc*:file=gc.log:time,uptime,level,tags

    //Deprecated in java9 and removed in java18
    /*@Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method is invoked..");
    }*/
}
