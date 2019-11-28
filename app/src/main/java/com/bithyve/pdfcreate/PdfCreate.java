package com.bithyve.pdfcreate;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;



import android.graphics.Bitmap;
import android.os.Environment;


import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;


//import net.glxn.qrgen.android.QRCode;
import net.glxn.qrgen.core.image.ImageType;

public class PdfCreate {
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 22,
            Font.BOLD);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);
    static String user = "123456";
    static String owner = "12345";

    public void creating() {
        try {
            Document document = new Document(PageSize.A4);
            String outPath = Environment.getExternalStorageDirectory() +"/pdf4thshare.pdf";
            //Create PDFWriter instance.
            PdfWriter pdfWriter =  PdfWriter.getInstance(document, new FileOutputStream(outPath));
            //Add password protection.
            pdfWriter.setEncryption(user.getBytes(), owner.getBytes(),
                    PdfWriter.ALLOW_COPY | PdfWriter.ALLOW_PRINTING, PdfWriter.STANDARD_ENCRYPTION_128);
            document.open();
            addMetaData(document);
            addTitlePage(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    private static void addMetaData(Document document) {
        document.addTitle("Hexa");
        document.addSubject("Using for recover wallet.");
        document.addKeywords("Hexa");
        document.addAuthor("Bithyve");
        document.addCreator("Bithyve");
    }

    private static void addTitlePage(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        preface.add(new Paragraph("Sagar Wallet's", catFont));
        document.add(preface);
        addEmptyLine(preface, 1);
        // part 1
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 1:",
                subFont));
        document.add(preface);
        BarcodeQRCode barcodeQRCode = new BarcodeQRCode("part1", 250, 250, null);
        Image codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);
    //part 2
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 2:",
                subFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("part2", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);

        document.newPage();
        //part 3
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 3:",
                subFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("part3", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);
        //part 4
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 4:",
                subFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("part4", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);
        document.newPage();

        //part 5
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 5:",
                subFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("part5", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);
        //part 6
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 6:",
                subFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("part6", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);
        document.newPage();

        //part 7
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 7:",
                subFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("part7", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);
        //part 8
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Part 8:",
                subFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("part8", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "e01{\"encryptedShare\":\"1c0096dd12abb2c454802dab" +
                        "cd3d36f01222c835232a8d30debd686f618066a6e42e8db" +
                        "e5e3d3bfc3b63370d44b266c83cd2a16161fd9ac4c8750" +
                        "be47dcb9b8a1a808c2f4601266485130e1f6e6387f17035" +
                        "1e987bbc2a488de1d31486a28656ae1d1a3ff64f60cfaf" +
                        "024e11a02162e620fe3bcbce05276a09a9092f62069835e" +
                        "5f718feb99ba7c6f0474fdeb5cbbf9a6c44023dcd2c1f48",
                smallBold));
        document.add(preface);
        document.newPage();
        // Secondary Xpub and 2FA Secret
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Secondary Xpub (Encrypted):",
                catFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("Secondary Xpub (Encrypted)", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Scan the above QR Code using your HEXA " +
                        "wallet in order to restore your Secure Account.",
                smallBold));
        document.add(preface);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "2FA Secret:",
                catFont));
        document.add(preface);
        barcodeQRCode = new BarcodeQRCode("2FA Secret", 250, 250, null);
        codeQrImage = barcodeQRCode.getImage();
        codeQrImage.scaleAbsolute(250, 250);
        document.add(codeQrImage);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "OJTHCTBQIRVUWK3IGM3XCS2NM5WTSZSX",
                smallBold));
        document.add(preface);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Following assets can be used to recover your funds using " +
                        "the open - sourced ga - recovery tool.",
                smallBold));
        document.add(preface);
        document.newPage();
        // Secondary Mnemonic and BitHyve Xpub
        preface = new Paragraph();
        preface.add(new Paragraph(
                "Secondary Mnemonic:",
                catFont));
        document.add(preface);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "drama quality empower cover girl follow near text " +
                        "donkey monster birth cable reveal quarter bar beyond " +
                        "junk ripple twice guess faculty ship inhale prosper",
                smallBold));
        document.add(preface);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "BitHyve Xpub:",
                catFont));
        document.add(preface);
        preface = new Paragraph();
        preface.add(new Paragraph(
                "tpubDJ3k7c98HTkjs3G7T41PMvWreRthJuS3AQkJ " +
                        "HwyLKUdSLz9rfEuksNvmuCNBuH6RnRSFwV52KQQi " +
                        "roNuYNJqFf9MS6gVVZBEB12QqLctGN1",
                smallBold));
        document.add(preface);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
