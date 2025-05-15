package udemy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dates {

    public static void main(String[] args) {
        
        // Formatadores de data personalizados
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Datas atuais
        LocalDate d01 = LocalDate.now();                  // Data atual (sem hora)
        LocalDateTime d02 = LocalDateTime.now();          // Data e hora atual
        Instant d03 = Instant.now();                      // Data e hora atual em UTC

        // Datas a partir de texto ISO 8601
        LocalDate d04 = LocalDate.parse("2025-10-12");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-12T16:21:26");
        Instant d06 = Instant.parse("2025-10-12T16:21:26Z");             // UTC
        Instant d07 = Instant.parse("2025-10-12T16:21:26-03:00");        // Fuso -03:00

        // Datas a partir de texto customizado
        LocalDate d08 = LocalDate.parse("20/07/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fmt2);

        // Datas criadas diretamente por parâmetros
        LocalDate d10 = LocalDate.of(2024, 10, 12);
        LocalDateTime d11 = LocalDateTime.of(2024, 10, 12, 1, 30);

        // Formatadores adicionais
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                                                   .withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;

        // Impressões formatadas
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        // Formatando d04 com diferentes formas
        System.out.println("d04 = " + d04.format(fmt3));
        System.out.println("d04 = " + fmt3.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05);
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println("d05 = " + d05.format(fmt3));
        System.out.println("d05 = " + d05.format(fmt6));   // ISO format

        System.out.println("d06 = " + d06);
        System.out.println("d06 = " + fmt7.format(d06));   // Instant formatado

        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
