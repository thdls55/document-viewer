package org.ebookdroid.droids.mupdf.codec;

import org.ebookdroid.common.settings.AppSettings;
import org.ebookdroid.core.codec.CodecDocument;


public class EpubContext extends MuPdfContext {

    @Override
    public CodecDocument openDocument(final String fileName, final String password) {
        final MuPdfDocument doc = new MuPdfDocument(this, MuPdfDocument.FORMAT_EPUB, fileName, password);
        final int em = AppSettings.current().epubFontEm;
        doc.setFontEm(em);
        return doc;
    }
}
