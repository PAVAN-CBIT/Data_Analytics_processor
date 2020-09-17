public class AggregatorApp
{

  public static void main(String[]args throws IOException
  {
  
    MaxAggregator agg = new MaxAggregator();
    AggregatorProcessor<MaxAggregator>aggsProcessor = new AggregatorProcessor<MaxAggregator>(aggs,"table.csv");
    double value =aggsProcessor.runAggregator(1);
    System.out.println(value);
  
  
  
  
  }




}
