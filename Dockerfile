FROM node:6-alpine
WORKDIR /usr/src/app
RUN apk add --no-cache tini
COPY package*.json ./
RUN npm install
RUN npm cache clean --force
COPY . .
EXPOSE 3000
ENTRYPOINT ["/sbin/tini", "--"]
CMD [ "node", "./bin/www" ]