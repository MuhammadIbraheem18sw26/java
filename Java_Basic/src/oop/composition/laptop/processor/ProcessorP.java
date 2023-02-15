package oop.composition.laptop.processor;

public class ProcessorP {
    private String processorName;
    private String processorSeries;
    private int cores;
    private int threads;

    public ProcessorP(String processorName, String processorSeries, int cores, int threads) {
        this.processorName = processorName;
        this.processorSeries = processorSeries;
        this.cores = cores;
        this.threads = threads;
    }

    public ProcessorP() {
        this.processorName = "intel";
        this.processorSeries = "7200";
        this.cores = 4;
        this.threads = 4;
    }

    public String getProcessorName() {
        return processorName;
    }

    public String getProcessorSeries() {
        return processorSeries;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    @Override
    public String toString() {
        return "ProcessorP{" +
                "processorName='" + processorName + '\'' +
                ", processorSeries='" + processorSeries + '\'' +
                ", cores=" + cores +
                ", threads=" + threads +
                '}';
    }
}
