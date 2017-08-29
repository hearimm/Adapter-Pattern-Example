package AdapterMap;

public class Client {

  public static void main(String[] args) {
    MapApi map = new DaumMap();
    mapInfo(map);
    MapApi googleMap = new GoogleMap();
    mapInfo(googleMap);
    
    //map.darkTheme(); // error:The method darkTheme() is undefined for the type MapApi
    ((GoogleMap) googleMap).darkTheme(); // OK! MapApi�� ���� ����� ������ �ٿ�ĳ����
  }

  public static void mapInfo(MapApi map) {
    System.out.println("\n");
    System.out.println("�� ����: " + map.drawMap());
    System.out.println("�������� >> " + map.moveToSuwon());
    System.out.println("����� >> " + map.moveToSeoul());
  }

}
