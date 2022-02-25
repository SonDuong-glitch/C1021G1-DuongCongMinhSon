package model;

public class TypeProduct {
    private int idType;
    private String TypeName;

    public TypeProduct() {
    }

    public TypeProduct(int idType, String typeName) {
        this.idType = idType;
        TypeName = typeName;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

}
