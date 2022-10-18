package client;

import java.io.IOException;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;
import aggregators.MeanAggregator;
import aggregators.MinAggregator;

public class AggregatorApp {
	public static void main(String[] args) throws IOException {
		
		//colIdx defines the column to be analyzed
		int colIdx = 1;
		
			MaxAggregator aggMax = new MaxAggregator();
			AggregatorProcessor<MaxAggregator> aggsProcessorMax = new AggregatorProcessor<MaxAggregator>(aggMax, "table.csv");
			double valueMax = aggsProcessorMax.runAggregator(colIdx);
			System.out.println("Max value: " + valueMax);
			
			MinAggregator aggMin = new MinAggregator();
			AggregatorProcessor<MinAggregator> aggsProcessorMin = new AggregatorProcessor<MinAggregator>(aggMin, "table.csv");
			double valueMin = aggsProcessorMin.runAggregator(colIdx);
			System.out.println("Min value: " + valueMin);
			
			MeanAggregator aggMean = new MeanAggregator();
			AggregatorProcessor<MeanAggregator> aggsProcessorMean = new AggregatorProcessor<MeanAggregator>(aggMean, "table.csv");
			double valueMean = aggsProcessorMean.runAggregator(colIdx);
			System.out.println("Mean value: " + valueMean);

	}
}
