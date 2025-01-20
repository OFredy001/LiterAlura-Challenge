package com.literalura.consumoAPIGutendexLiterAlura.config.iConfig;

public interface IConvertirDatos {
    <T> T convertirDatosJsonAJava(String json , Class<T> clase);
}
