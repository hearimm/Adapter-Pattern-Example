package AdapterMap;

public class DaumMap implements MapApi {
  String mapName = "������";

  public String drawMap() {
    return mapName;
  }

  public String moveToSuwon() {
    return "����";
  }

  public String moveToSeoul() {
    return "����";
  }
}
