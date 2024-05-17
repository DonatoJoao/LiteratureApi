import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        LiteraturaApi literaturaApi = new LiteraturaApi();
        try {
            LiteraturaDto literaturaDto = literaturaApi.getTerm("alice");
            System.out.println("oi "+literaturaDto);
            System.out.println("oi" + literaturaDto.getTitle());
            System.out.println();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        /*
        Minha saída está com o seguinte problema:

        Cannot deserialize value of type `java.lang.String` from Array value (token `JsonToken.START_ARRAY`)
            at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 11]
            (through reference chain: LiteraturaDto["result"])

            Como arrumar?
         */


    }
}