public class AggregatorProcessor<T extends Aggregator>
{
  T aggregator;
  String file;
  
  
  
  public AggregatorProcessor(T aggregator,String file)
  {
    super();
    this.aggregator = aggregator;
    this.file = file; 
  }
  
  
  public double runaggregator(int colIdx)throws IOException
  {
  
    StockFileReader filereader = new StockFileReader(file);
    List<String>lines = filereader.readFileData();
    colIdx--;
    for(String line : lines)
    {
      String[]numbers = line.split(",");
      double value =Double.parseDouble(numbers[colIdx]);
      aggregator.add(value);
      
    
    }
    double number = aggregator.calculate();
    return number;
  
  
  }




}
