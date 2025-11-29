import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {


    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("db.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                String[] parts = line.split("\\s+");
                map.put(parts[0], parts[1]);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = sc.nextLine().trim();
            if (!map.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.print("password: ");
            String pw = sc.nextLine().trim();
            if (!map.get(id).equals(pw)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            if (map.containsKey(id) && map.get(id).equals(pw)){
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
