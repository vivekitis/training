//package net.media.training.whois;

import java.net.*;
import java.io.*;

class WhoIs {
    public static void main(String[] args) throws Exception {
        int c;
        Socket s = new Socket("whois.answerable.com", 43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        String str = "directi.com\n";
        byte[] buf = str.getBytes();
        out.write(buf);
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();

        // have you heard of bulk whois servers ???
    }
}
