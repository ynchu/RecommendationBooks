function segmentTheme(strValue) {
    let end = strValue.indexOf("segment");
    return strValue.substring(0, end);
}

function segmentBody(strValue) {
    let index = strValue.indexOf("segment");
    let start = index + "segment".length;
    return strValue.substring(start);
}

// 回车转<br/>
function getFormatCode(strValue) {
    return strValue.replace(/\r\n/g, '<br>').replace(/\n/g, '<br>').replace(/\s/g, ' ')
        .replace(/"/g, "&quot;");
}

// <br/>转回车
function getCode(strValue) {
    return strValue.replace(/<br>/g, "\n").replace(/&quot;/g, "\"");
}