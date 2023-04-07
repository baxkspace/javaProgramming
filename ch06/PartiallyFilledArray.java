public class PartiallyFilledArray {
    private int maxNumberElements;
    private double[] a;
    private int numberUsed;

    public PartiallyFilledArray() {
        maxNumberElements = 10;
        a = new double[maxNumberElements];
        numberUsed = 0;
    }

    public PartiallyFilledArray(int arraySize) {
        if (arraySize <= 0) {
            System.out.println("Error Array size zero or negative.");
            System.exit(0);
        }
        maxNumberElements = arraySize;
        a = new double[maxNumberElements];
        numberUsed = 0;
    }

    public PartiallyFilledArray(PartiallyFilledArray original) {
        if (original == null) {
            System.out.println("Fatal Error: aborting program.");
            System.exit(0);
        }
        maxNumberElements =
                original.maxNumberElements;
        numberUsed = original.numberUsed;
        a = new double[maxNumberElements];
        for (int i = 0; i < numberUsed; i++)
            a[i] = original.a[i];
    }

    public void add(double newElement) {
        if (numberUsed >= a.length) {
            resize();
        } else {
            a[numberUsed] = newElement;
            numberUsed++;
        }
    }

    public void resize() {
        maxNumberElements *= 2;
        double[] newArray = new double[maxNumberElements];
        for (int i = 0; i < maxNumberElements / 2; i++)
            newArray[i] = a[i];

        a = new double[maxNumberElements];
        for (int i = 0; i < maxNumberElements / 2; i++)
            a[i] = newArray[i];
    }

    public double getElement(int index)
    {
        if (index < 0 || index >= numberUsed)
        {
            System.out.println("Error:Illegal or unused index.");
            System.exit(0);
        }

        return a[index];
    }

    public void resetElement(int index, double newValue)
    {
        if (index < 0 || index >= maxNumberElements)
        {
            System.out.println("Error:Illegal index.");
            System.exit(0);
        }
        else if (index > numberUsed)
        {
            System.out.println(
                    "Error: Changing an index that is too large.");
            System.exit(0);
        }
        else
            a[index] = newValue;
    }

    public void deleteLast( )
    {
        if (empty( ))
        {
            System.out.println("Error:Deleting from an empty array.");
            System.exit(0);
        }
        else
            numberUsed--;
    }

    public void delete(int index)
    {
        if (index < 0 || index >= numberUsed)
        {
            System.out.println("Error:Illegal or unused index.");
            System.exit(0);
        }

        for (int i = index; i < numberUsed; i++)
            a[i] = a[i + 1];
        numberUsed--;
    }

    public void getIndex(double data) {
        for (int i = 0; i < numberUsed; i++)
            if (a[i] == data)
                System.out.print(i + " ");
    }
    public boolean empty( )
    {
        return (numberUsed == 0);
    }

    public boolean full( )
    {
        return (numberUsed == maxNumberElements);
    }

    public int getMaxCapacity( )
    {
        return maxNumberElements;
    }

    public int getNumberOfElements( )
    {
        return numberUsed;
    }
}