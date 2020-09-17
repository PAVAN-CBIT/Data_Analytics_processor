public class Stockfilereader
{

  String filePath = null;
  public Stockfilereader(String filepath)
  {
    this.filepath = filepath;
  }
  public List<String>getHeaders()throws IOException
  {
   String line = readfirstline(filepath);
    String[]header = line.split(",");
    List<String>values = new Arraylist<String>();
    values = Arrays.aslist(header);
    return values;
  
  }
  static String readfirstline(String path)throws IOException
  {
  
  try(BufferReader br =
                  new BufferReader(new FileReader(path)))
  {
  
      return br.readline();
  
  
  }
    
  
  
  }    
   public List<String> readfiledata()throws IOException
   
   
   {
     List<String>lines = new ArrayList<String>();
     try(BufferedReader br = new Bufferedreader(new filereader(filepath)))
     {
        br.readline();
        String line = null;
         while(line=br.readline())!=null)
         {
          lines.add(line);
         
         }
     }
   
   return lines;
   
   
   
   }
     






}

