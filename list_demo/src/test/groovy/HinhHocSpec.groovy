import hinh.HinhHoc
import hinh.Hinhs
import spock.lang.Specification

class HinhHocSpec extends Specification{

    final HinhHoc HINHVUONG = new Hinhs.HinhVuong(10)
    final HinhHoc HINHTRON = new Hinhs.HinhTron(5)
    final HinhHoc HINHCN = new Hinhs.HinhCN(4,6)

    def "Dien tich hinh vuong"() {

        expect:
        HINHVUONG.tinhDienTich() == 100
    }

    def "Dien tich hinh tron"() {

        expect:
        HINHTRON.tinhDienTich() == 314.12999629974365
    }
    def "Dien tich Hinh chu nhat"() {

        expect:
        HINHCN.tinhDienTich() == 24

    }
}
