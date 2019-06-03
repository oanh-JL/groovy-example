package hinh

class Hinhs {

     static class HinhTron extends HinhHoc {

        final float PI = 3.1413
        double r
         HinhTron(float r) {
             this.r = r
         }
         @Override
         double tinhDienTich() {
             return r*r*PI
         }
    }

     static class HinhCN extends HinhHoc {

        float cDai, cRong
         HinhCN( float cdai, crong) {
             this.cDai = cdai
             this.cRong = crong
         }
        @Override
        double tinhDienTich() {
            return cDai*cRong
        }
    }

     static class HinhVuong extends HinhHoc {

        float canh
         HinhVuong(float canh) {
             this.canh = canh
         }
        @Override
        double tinhDienTich() {
            return canh*canh
        }
    }



}
