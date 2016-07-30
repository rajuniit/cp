import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Fastest Way to read input and print output
 *
 * Author: Raju Mazumder <rajuniit@gmail.com>
 */
class TestClass {
    public static void main(String args[] ) throws Exception {
    	InputStream inputStream = System.in;
    	OutputStream outputStream = System.out;
    	InputReader in = new InputReader(inputStream);
    	PrintWriter out = new PrintWriter(outputStream);
    	Programmer p = new Programmer();
    	p.solve(in,out);
    	out.close();
        
    }

    static class Programmer {
    	public void solve(InputReader in, PrintWriter out) {
    		// Write your code here
    	}
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
