import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class TicketGenerator {

    public static void generateTicket(String filePath) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                contentStream.beginText();
                contentStream.newLineAtOffset(100, 700);
                contentStream.showText("Restaurante XYZ");
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("-------------------------------");
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Producto: Pizza Margarita");
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Precio: $10.00");
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Cantidad: 2");
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Total: $20.00");
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("-------------------------------");
                contentStream.endText();
            }

            document.save(filePath);
            System.out.println("PDF generado exitosamente en: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "C:/Users/oribi/Documents/GitHub/proyecto1/GenerarReporteProyecto/ticket.pdf";
        generateTicket(filePath);
    }
}

