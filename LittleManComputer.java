public class LittleManComputer {
    private int[] mailbox = new int[100];
    private int counter;
    private int accumulator;
    private int inputBox;
    private int outputBox;

    public LittleManComputer() {
        this.counter = 0;
        this.accumulator = 0;
        this.inputBox = 0;
        this.outputBox = 0;
    }

    public int getInputBox() {
        return inputBox;
    }

    public void setInputBox(int inputBox) {
        this.inputBox = inputBox;
    }

    public int[] getMailbox() {
        return mailbox;
    }

    public void setMailbox(int[] mailbox) {
        this.mailbox = mailbox;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(int accumulator) {
        this.accumulator = accumulator;
    }

    public int getOutputBox() {
        return outputBox;
    }

    public void setOutputBox(int outputBox) {
        this.outputBox = outputBox;
    }
}
