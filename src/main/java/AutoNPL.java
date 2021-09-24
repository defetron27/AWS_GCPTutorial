import com.google.cloud.automl.v1beta1.AutoMlClient;

public class AutoNPL
{
    public static void main(String[] args)
    {
        String sentence = "";

        try
        {
            testTheSentence(sentence);
        }
        catch (Exception e)
        {
            System.out.print(e.getMessage());
        }
    }

    private static void testTheSentence(String sentence) throws Exception
    {
        // initialize the auto ml client to get results

        AutoMlClient client = AutoMlClient.create();

        
    }
}



















