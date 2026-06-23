# Tugas 11 - Connect to the Internet

## Identitas
- **Nama**: Fatih Jawwad Al Mumtaz
- **NIM**: 452024611047

## Deskripsi
Aplikasi Android untuk menampilkan daftar properti dari Mars (Mars Real Estate) yang diambil dari RESTful API menggunakan **Retrofit**, parsing JSON dengan **Moshi**, dan menampilkan gambar menggunakan **Glide**. Data ditampilkan dalam GridLayout 2 kolom menggunakan RecyclerView dengan DataBinding.

## Fitur
- Koneksi internet menggunakan Retrofit + Moshi
- Parsing JSON otomatis ke Kotlin data class
- Eksekusi network secara asinkron dengan Coroutines (viewModelScope)
- Pemuatan gambar dari URL menggunakan Glide dengan BindingAdapter kustom
- Placeholder saat memuat dan gambar error jika koneksi terputus
- GridLayout 2 kolom dengan MaterialCardView

## Screenshot
*(Tambahkan screenshot aplikasi di sini)*

![Screenshot Aplikasi](screenshot/app_screenshot.png)

## Perbedaan Normal Permission vs Dangerous Permission

### Normal Permission (seperti INTERNET)
Normal Permission adalah izin yang dianggap tidak membahayakan privasi pengguna secara langsung. Ketika aplikasi mendeklarasikan normal permission di AndroidManifest.xml, sistem akan secara **otomatis mengabulkan** izin tersebut tanpa perlu meminta konfirmasi pengguna saat runtime. Pengguna tidak akan melihat dialog izin untuk normal permission. Selain INTERNET, contoh lainnya adalah ACCESS_NETWORK_STATE, VIBRATE, dan SET_WALLPAPER.

### Dangerous Permission
Dangerous Permission adalah izin yang berpotensi mengakses data pribadi atau sumber daya sensitif pengguna. Contohnya adalah akses ke **kamera** (CAMERA), **lokasi** (ACCESS_FINE_LOCATION), **kontak** (READ_CONTACTS), **penyimpanan** (READ_EXTERNAL_STORAGE), dan **mikrofon** (RECORD_AUDIO). Untuk dangerous permission, pengguna harus memberikan izin secara **eksplisit melalui dialog runtime prompt** yang muncul saat aplikasi pertama kali membutuhkan akses tersebut. Pengguna dapat menolak izin kapan saja melalui pengaturan sistem.

### Tabel Perbandingan

| Aspek | Normal Permission | Dangerous Permission |
|-------|-------------------|---------------------|
| **Contoh** | INTERNET, VIBRATE | CAMERA, ACCESS_FINE_LOCATION |
| **Cara aktivasi** | Otomatis saat install | Dialog runtime prompt |
| **Dapat ditolak?** | Tidak (otomatis diberikan) | Ya, oleh pengguna |
| **Deklarasi** | Hanya di AndroidManifest.xml | AndroidManifest.xml + kode runtime request |
| **Resiko privasi** | Rendah | Tinggi |
