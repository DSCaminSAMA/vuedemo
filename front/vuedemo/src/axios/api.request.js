import axios from "axios";
import config from './index';
const baseUrl=process.env.NODE_ENV==='development'? config.baseUrl.dev : config.baseUrl.pro

const HttpRequest = axios.create({
  baseURL:baseUrl,//api的baseUrl
  timeout:5000
});
export default HttpRequest;
