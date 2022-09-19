// package.json add dependencies;
// "crypto-js": "^4.1.1"
import CryptoJS from 'crypto-js';

CryptoJS.enc.Uint8Array = {
    /**
     * WordArray to Uint8Array
     * @param wordArray
     * @returns {Uint8Array}
     */
    stringify: function (wordArray) {
        var words = wordArray.words;
        var sigBytes = wordArray.sigBytes;
        var u8 = new Uint8Array(sigBytes);
        for (var i = 0; i < sigBytes; i++) {
            var byte = (words[i >>> 2] >>> (24 - (i % 4) * 8)) & 0xff;
            u8[i] = byte;
        }
        return u8;
    },
    /**
     * Uint8Array to WordArray
     * @param u8arr
     * @returns {WordArray}
     */
    parse: function (u8arr) {
        var len = u8arr.length;
        var words = [];
        for (var i = 0; i < len; i++) {
            words[i >>> 2] |= (u8arr[i] & 0xff) << (24 - (i % 4) * 8);
        }
        return CryptoJS.lib.WordArray.create(words, len);
    }
};

let decrypt = function (encrypted, key) {
    let sha1 = CryptoJS.SHA1(CryptoJS.SHA1(key));
    let uint8Array = CryptoJS.enc.Uint8Array.stringify(sha1);
    let uint8Array2 = uint8Array.slice(0, 16);
    let keyWordArray = CryptoJS.enc.Uint8Array.parse(uint8Array2);
    let decrypt = CryptoJS.AES.decrypt(encrypted, keyWordArray, {iv: keyWordArray, mode: CryptoJS.mode.CBC, padding: CryptoJS.pad.Pkcs7});
    return CryptoJS.enc.Utf8.stringify(decrypt).toString();
};

