FROM python:3.6.6-alpine
COPY logic /app
WORKDIR /app
RUN pip3 install -r requirements.txt 
EXPOSE 5000
ENTRYPOINT ["python3"]
CMD ["logic.py"]
